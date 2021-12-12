# RaspPiOpgave

Den her opgave indeholder en socket server der er skrevet i python og kører på en Raspberry Pi, og en socket server skrevet i Java der kører på en regulær PC.
Serveren er i stand til at sende data fra en sensor koblet til Raspberry Pi'en når den bliver promptet fra clienten.

# Opsætning af Raspberry Pi
Til at starte med fik vi udleveret en Raspberry Pi med et tilhørende SD kort. SD kortet blev indlæst i en PC, og fik installeret Raspberry Pi OS. For at tilgå WiFi, skulle vi tilføje en SSH fil og supplicant.conf fil før SD kortet blev sat i Raspberry Pi'en.

I vores projekt var der noget galt med Raspberry Pi'en, hvilket betød at den skulle sættes direkte til en router med et ethernet kabel, for at vi kunne tilgå selve Raspberry Pi'ens OS og konfigurer WiFi indstillingerne direkte. 

# Protokoller
I projektet har vi valgt at bruge TCP/IP, da der oprettes en direkte forbindelse mellem to enheder, i stedet for det store broadcast UDP anvender.

# Resultat af kommunikation
Client side (Terminal):

![alt text](https://github.com/AsHuOvSo/RaspPiOpgave/blob/278d0ce7f9ab8b48fec8a0801f805e7e22f0f31a/clientRecData.PNG "Client Terminal")

Server side (Terminal):

![alt text](https://github.com/AsHuOvSo/RaspPiOpgave/blob/278d0ce7f9ab8b48fec8a0801f805e7e22f0f31a/serverSendingData.PNG "Server Terminal (via Putty)")

# Problemer
## 1. Hardware
Vores gruppe stod i den situation før afleveringsfristen, at vi ikke kunne få fat i personen der havde hardwaren, så vi kunne ikke færdiggøre projektet.
Efter vi fik hardware, virkede Raspberry Pi'en ikke. Heldigvis sad en fra gruppen og havde en privat en derhjemme, som er blevet brugt til projektet i stedet.

## 2. Skema
Da dette projekt blev givet, havde vi tid op i skolen til at lave det. Desværre kom sygdom i vejen for at vi var der samlet, og processen blev rodet.
Efter afleveringsfristen, men hvor vi havde fået tid til at lave projektet, kom der en del andre opgaver og projekter oven i, hvilket gjorde at det var svært at finde tid til at lave projektet færdigt. Projektet er derfor blevet lavet på diverse tidspunkter om aftenen eller i weekenden.

# Konklusion
Dette projekt var en god træning i at finde løsnsinger på nettet angående Raspberry Pi og Python. Næste gang vil det ønskes at man har noget træning i python inden, eller at både server og client bliver skrevet i samme sprog, i stedet for to forskellige.
