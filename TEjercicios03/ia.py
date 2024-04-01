import speech_recognition as sr
import pyttsx3
import pywhatkit
import urllib.request
import json
import datetime
import wikipedia

# nombre de nuestro asistente, siempre di su nombre primero
name = 'ALEXA'  

# tu clave de API de YouTube
key = 'AIzaSyCoh0KZMrKjCDmPNP3ktYFTk3BimW-5GcQ'

# el indicador nos ayuda a apagar el programa
flag = 1

listener = sr.Recognizer()

engine = pyttsx3.init()

# obtener voces y establecer la primera de ellas si hay al menos una voz disponible
voices = engine.getProperty('voices')
if voices:
    engine.setProperty('voice', voices[0].id)

# editar la configuración predeterminada
engine.setProperty('rate', 178)
engine.setProperty('volume', 0.7)

def talk(text):
    '''
        aquí, el asistente virtual puede hablar
    '''
    engine.say(text)
    engine.runAndWait()

def listen():
    '''
        El programa recupera nuestra voz y la envía a otra función
    '''
    global flag
    try:
        with sr.Microphone() as source:
            print("Escuchando...")
            voice = listener.listen(source)
            rec = listener.recognize_google(voice, language='es-ES')
            rec = rec.lower()
            
            if name in rec:
                rec = rec.replace(name, '')
                flag = run(rec)
            else:
                talk("Vuelve a intentarlo, no reconozco: " + rec)
    except:
        pass
    return flag

def run(rec):
    '''
        Todas las acciones que puede realizar el asistente virtual
    '''
    global flag
    if 'reproduce' in rec:
        music = rec.replace('reproduce', '')
        talk('Reproduciendo ' + music)
        pywhatkit.playonyt(music)
    elif 'cuantos suscriptores tiene' in rec:
        name_subs = rec.replace('cuantos suscriptores tiene', '')
        data = urllib.request.urlopen(f'https://www.googleapis.com/youtube/v3/channels?part=statistics&forUsername={name_subs.strip()}&key={key}').read()
        subs = json.loads(data)["items"][0]["statistics"]["subscriberCount"]
        talk(name_subs + " tiene {:,d}".format(int(subs)) + " suscriptores!")
    elif 'hora' in rec:
        hora = datetime.datetime.now().strftime('%I:%M %p')
        talk("Son las " + hora)
    elif 'busca' in rec:
        order = rec.replace('busca', '')
        wikipedia.set_lang("es")
        info = wikipedia.summary(order, 1)
        talk(info)
    elif 'exit' in rec:
        flag = 0
        talk("Saliendo...")
    else:
        talk("Vuelve a intentarlo, no reconozco: " + rec)
    return flag

while flag:
    flag = listen()