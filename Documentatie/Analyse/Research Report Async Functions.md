<h1 style="text-align:center">Async functions</h1>

### Hoofd en Deelvragen
Waarom zou ik Async functies gebruiken?
- Wat is Async?
- Wat in Synchronous?
- Wanneer gebruik ik wat?
- Wat zijn de gevaren hierbij?
- Hoe kan ik Async testen?

### Inhoud
1. [Hoofd en Deelvragen](#hoofd-en-deelvragen)
2. [Inhoud](#inhoud)
3. [Wat is Async?](#wat-is-async)
4. [Wat is Synchronus?](#wat-is-synchronus)
5. [Wanneer wat te gebruiken?](#wanneer-wat-te-gebruiken)
6. [Wat zijn de gevaren?](#wat-zijn-de-gevaren)
7. [Hoe kan ik dit testen?](#hoe-kan-ik-dit-testen)
8. [Conclusie](#conclusie)

### Wat is Async?
Het woord Async stamt af van het Grieks. Met de woorden asyn: niet met & Chronos: tijd. Dit betekent dat Async betekend dat iets niet tijdsgebonden is. [^1] op verschillende plekken heeft het een andere betekenis. Hierom ga ik alleen kijken wat Async betekent bij programeren.  
Bij programeren word het meer als een asynchroon process gebruikt. Wat betekent dat dit process los staat van alle andere processen. Verschillende talen implementeren dit ook en dan word dit stuk "nonblocking code" genoemd. Met dit soort methodes kun je ervoor dus zorgen dat ondertussen andere code nog door kan lopen zonder dat dit verstoort word omdat het moet wachten op een ander stuk code dat nog afgemaakt moet worden. Hierdoor is het slim om code dat lang duurt om af te maken Async te maken zodat je ondertussen nog andere dingen kunt laten gebeuren.

### Wat is Synchronus?
Synchroon is dus eigenlijk het tegenovergestelde van ascynchroon.[^2] Dit zijn in het programeren de processen die eigenlijk achter elkaar lopen. Hierdoor kan de code pas verder als al het vorige stuk code is uitgevoerd. Zo kun je denken aan het bakken van een cake. Je moet het recept volgen om zo tot een mooi eindproduct te komen. Als je alles tegelijk of in verkeerde volgorde doet dan komt er niet veel moois uit.

### Wanneer wat te gebruiken?
Async en Synchronous worden dus op verschillende plekken het best benut. Maar wanneer dan?[^3]  

Je gebruikt synchroon bijvoorbeeld bij:
- Updaten van belangrijke data 
- Ophalen van gegevens
- Kleine calculaties 
- Korte processen

En Asynchroon bij:
- Individuele data
- pre-loaden van data
- lange processen
- complexe stukken code

### Wat zijn de gevaren?
Bij het gebruiken van async komen ook wat "gevaren" bij kijken.[^3] Zo kan het zijn dat als je belangrijke data asynchroon op zou gaan slaan of bewerkt dat deze corrupt wordt. Ook kun je teveel tegelijk willen gaan doen waardoor je de CPU gaat overbelasten terwijl dit niet nodig is. Hierdoor word vrijwel alles trager waardoor de gebruiker misschien de pagina meerdere malen kan refhreshen waardoor het alleen maar meer word overbelast.

### Hoe kan ik dit testen?
Omdat de code Asynchronous gebeurt komt er bij het testen iets meer bij kijken. Om dit goed te doen moet je dus tegen je testen zeggen dat wat je aan het testen bent Async is. Hiervoor kun je dingen zoals een await operator gebruiken. Hierbij wacht hij als het waren tot dat stukje code klaar is, maar zo kun je ook callbacks en promises gebruiken waardoor hij kijkt of er iets word teruggegeven.  
Zo kun je ook nog load testing gebruiken. Hierbij test je als het waren meerdere gebruikers die bepaalde tasks uitvoeren om te kijken of je systeem dit aan kan en niet gaat bottlenecken of misschien zelfs crashen.

### Conclusie
Waarom zou je nou dus Async methodes gebruiken? Async methodes zijn vooral handig om bepaalde tasks op de achtergrond of tegelijk met iets anders te laten gebeuren. Zo kun je bepaalde data pre-loaden op de achtergrond of kun je iets real-time maken door een process ondertussen door te laten lopen. Wel moet je oppassen dat je dit niet op verkeerde plekken toepast om zo je hardware niet onnodig te laten belasten en het veilig houden van belangrijke data. Dit soort methodes kun je ook makkelijk automatisch laten testen zodat je hier niet veel extra tijd mee kwijt bent.  
Async is dus heel handig om bepaalde grote taken op de achtergrond uit te voeren waardoor je niet op een "frozen" screen zit te wachten.

[^1]: https://www.javatpoint.com/asynchronous
[^2]: https://www.bmc.com/blogs/asynchronous-programming/#:~:text=Synchronous%20programming%20follows%20a%20strict%20set%20of%20sequences.,Synchronous%20programming%20follows%20a%20%E2%80%9CBake%20a%20cake%E2%80%9D%20algorithm.
[^3]: https://stackify.com/when-to-use-asynchronous-programming/
[^4]: https://jestjs.io/docs/asynchronous#:~:text=To%20write%20an%20async%20test%2C%20use%20the%20async,%28%29%20%3D%3E%20%7B%20const%20data%20%3D%20await%20fetchData%28%29%3B