<h1 style="text-align:center">Vulnerable and Outdated Components</h1>

### Hoofd en deelvragen
Hoe zorg ik dat mijn componenten zo min mogelijke vulnerabilies hebben?

- Wat zijn Components?
- wanneer ben je nu vulnerable?
- Wanneer zijn deze secure?
- Waarom zou je ze up to date moeten houden?
- Wat kan er misgaan als je dit niet doet?

---
### Inhoud:

1. [Hoofd en Deelvragen](#hoofd-en-deelvragen)
2. [Inhoud](#Inhoud)
3. [Wat zijn componenten](#wat-zijn-componenten)
4. [Wanneer ben je vulnerable](#wanneer-ben-je-nu-vulnerable)
5. [Wat kun je er tegen doen](#wat-kun-je-er-tegen-doen)
6. [Best practices](#best-practices23)
7. [Hoe kun je dit testen?](#hoe-kun-je-dit-testen)
7. [Conclusie](#conclusie)

---

### Wat zijn componenten?
Componenten zijn eigenlijk onderdelen van een groter geheel, dit zijn dus vaak delen van je project waar je gebruik van maakt zodat het geheel werkt. Het is dus belangrijk dat deze goed met elkaar kunnen samen werken en geen fouten bevat. Omdat je vaak componenten "leent" van andere developers kun je niet altijd zeker ervan zijn of ze helemaal goed zijn.

### Wanneer ben je nu vulnerable?
Je hebt een grote kans dat je vulnerable bent door een of meer van de volgende punten[^1]:
- Als je niet alle versies weet van je componenten (client maar ook server sided). Dit gaat over alle componenten die je gebruikt, zowel direct als nested dependencies.
- Als de software die je gebruikt vulnerable, out-of-date of unsupported is, dit betrekt ook het OS, de web/application server, het database management system, APIs en alle componenten, runtime enviroments en libraries.
- Als je niet regelmatig naar vulnerabilites scant en kijkt naar security bulletins die gaan over de componenten die je gebruikt.
- Als je als software developer niet test op compatibaliteit van de geüpdated, geüpgraded of gepatchte libraries.
- Als je de configurations van de component niet secure maakt.
- Als je niet het onderliggende platform, frameworks en dependencies repareert of upgrade in een tijdelijke manier. Dit gebeurd vaak in enviroments waar je maandelijks of kwartaalijks je enviroments patcht. Dit laat organisaties open voor dagen of maanden van onnodige exposure van gefixte vulnerabilites.

Hierom is het belangrijk dat je naar deze punten regelmatig kijkt en zo weet of je alles netjes bij houd.

### Wat kun je er tegen doen?
Je zou een patch management moeten hebben die het volgende kan doen[^1]:
- het verijderen van ongebruikte dependencies, onnodige features, componenten, bestanden en documentatie
- Het continu bijhouden van de versies van je gebruikte componenten (client EN server sided) en hun dependencies met tools zoals: versies, OWASP dependency check, retire.js enzovoort. Ook zou je continu moeten kijken naar sources zoals: Common vulnerability en exposures (CVE) en het National Vulnarability Database (NVD) voor vulnarabilities in je componenten. Dit process kun je ook automatiseren.
- Gebruik alleen componenten van officiële sources met secure links. Neem de voorkeur op gesigneerde packages om zo min mogelijk kans te hebben op gemodificeerde of malicious components.
- Het bijhouden van libraries en componenten die niet bijgehouden meer worden of geen security patches voor oude versies uit brengen. Als je ze niet kunt patchen probeer dan een virtual patch uit om zo via het bijhouden, detecteren of jezelf te beschermen tegen het gevonden probleem.

### Best practices[^2][^3]:
- Prioritiseer een Policy, als een component een Policy heeft kijk hier dan goed naar en leef deze ook na. Dit is opgesteld zodat je niet iets verkeerd gaat gebruiken waardoor er onnodige fouten in voorkomen
- Update regelmatig, zodra er een patch uit word gebracht worden hier vaak bugs en exposures gefixed. Als je dit zo snel mogelijk patched dan is de kans dat je succesvol aangevallen word zo min mogelijk.
- Kijk goed naar de kwaliteit van een component, je gebruikt vaak componenten die je collega's en vrienden ook gebruiken omdat zij hier al bekend mee zijn. Beter is om te kijken naar de kwaliteit van de component dan naar bekendheid. Dus kijk goed naar de voordelen en nadelen van een component en weeg deze tussen elkaar af.
- Gebruik een binaire Repo Manager, dit is een essentiële tool voor het beheren van je componenten. Zulke tools laten je locale kopiën van componenten opslaan waardoor je je packages kunt gebruiken zelfs tijdens outages
- Gebruik build tools, CI tools zoals Jenkins of Git Actions laten je makkelijk inzien en beheren van je componenten. Zo kun je snel security flaws inzien en deze repareren.

### Hoe kun je dit testen?
Je kunt verschillende tooling inschakelen om zo als je een nieuw component toevoegd meteen te kunnen kijken op dergelijke fouten. Zo kun je bijvoorbeeld in je CI pipeline een check laten uitvoeren op compatibility issues of dat je compenent bekende en gevaarlijke fouten bevat. Dus ook of hier een bestaande patch voor is. Zo kun je ook testen of je wel de laatste en veiligste versie hebt.  
Verder kun je ook zelf nagaan op verschillende sites zoals: [OWASP](https://owasp.org/). dit is een site waarop je snel kunt zien of er vulnerabilities in een component zitten / zijn gevonden. Hierdoor kun je snel kijken of er een update of een patch voor is.  
Als er geen patches of updates zijn kun je zelf ook nog altijd kijken of je dit zelf kunt oplossen door zelf een patch te maken.

### Conclusie
Hoe zorg ik dat mijn componenten zo min mogelijke vulnerabilities hebben? Als eerst kijken we naar wanneer je componenten nu vulnerable zijn. Dit kan gebeuren door dat ze outdated zijn, niet meer worden bijgewerkt, niet samen werken met andere componenten of door een onbetrouwbare site is verkregen. Hierdoor kan je component niet goed werkt of je applicatie open stelt tot het lekken van gevoelige data of cyber aanvallen. Om dit te voorkomen is het belangrijk dat je regelmatig naar updates kijkt van je componenten, goed naar de source kijkt waar je ze vandaan haalt, de policies nastreeft van de components, checkt of ze samenwerken, kijkt of ze bugs bevatten en eventueel het zelf modificeren / patchen van deze componenten. Dit kun je handmatig doen of je kunt voor een groot deel van deze taken een pipeline opzetten zodat het automatisch gebeurt.  
Het is dus belangrijk dat je alles goed bijhoud en ook goed nadenkt of dit component wel gebruikt moet worden in je project.

[^1]: https://owasp.org/Top10/A06_2021-Vulnerable_and_Outdated_Components/
[^2]: https://devops.com/5-best-practices-for-managing-open-source-components/
[^3]: https://www.altexsoft.com/blog/engineering/5-best-practices-for-managing-open-source-components/
