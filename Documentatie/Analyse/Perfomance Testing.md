### Performance testing

### Wat is Performance testing?
Performance tests zijn eigenlijk tests om de snelheid, scalabitity, en stabiliteit van een applicatie testen onder een specifieke workload. Waarin senlheid word gelet op hoe snel de applicatie reageert, scalability word gekeken naar hoeveel gebruikers tegelijk kunnen behandeld worden en stabiliteit the conditie van je applicatie bepaald onder vereschillende ladingen.  
Hierbij heb ook nog verschillende soorten tests[^1]:
- Volume tests, hierbij test je de workload van je applicatie met verschillende volumes in je database
- Stress tests, hierbij test je wanneer de applicatie breekt als je extreem veel workloads hebt
- Spike tests, hiebij test je wat de applicatie doet als hij ineens een spike krijgt aan workloads
- scalability tests, hierbij test je hoeveel personen je applicatie tegelijk kan hanteren
- Load tests, hierbij test je of er performance bottlenecks zijn bij meerdere workloads
- endurance tests, hierbij test je  of je applicatie verschillende workloads ook voor langere tijden aankan

### Waarom performance testing?
Door performance tests te doen kun je ervoor zorgen dat je applicatie snel en responsive blijft. Hierdoor is de kans groter dat mensen gebruik van je applicatie maken en deze ook blijven maken. Ook test je hierdoor of je applicatie niet breekt als er teveel gebeurt waardoor je down time krijgt wat ervoor zorgt dat niemand de applicatie kan gebruiken want in sommige gevallen een groot verlies kan zijn voor bijvoorbeeld een webshop bedrijf.

### Testing tools[^2]
- Loadninja:
    - Scriptless load test creation & playback with InstaPlay recorder
    - Real browser load test execution at scale
    - VU Debugger – debug tests in real time
    - VU Inspector – manage virtual user activity in real time.
    - Hosted on the cloud, no server machine & upkeep required
    - Sophisticated browser-based metrics with analytics and reporting features
- Webload:
    - WebLOAD is offered on the Cloud (SAAS) or as an On-Prem deployment
    - Flexible test scenario creation
    - Smart Scripting based native JavaScript with Powerful correlation, parametrization and validation engines
    - Supports every major web technology and easily extendible
    - Automatic bottleneck detection
    - Easy-to-reach customer support
- Kobiton:
    - Kobiton’s device lab management will let you connect with devices in the cloud, your local on-premises devices as well as on-desk devices.
    - Create automated test scripts from manual tests and are executable on multiple devices simultaneously.
    - Users can test crucial app and website-specific performance with Kobiton’s Payload capture
    - Automatic test case generation from the manual session
- Headspin: 
    - Monitor and optimize performance across the entire user journey
    - Performance data from real-world conditions
    - Leverage advanced AI capabilities to automatically identify performance issues in testing before they impact users.
    - Test on thousands of real devices in hundred-plus locations with SIM card-enabled devices.
- StresStimilus:
    - End-to-end Test Wizard covers all steps from recording to test results, which reduces the learning curve
    - On-premise or cloud testing supported with multiple load generators
    - Works as a stand-alone tool or Fiddler add-on
    - Exports script to Visual Studio test format to help with scenarios that fail when recorded in Visual Studio directly
    - Manual scripting is not required but available; supports three scripting languages

[^1]: https://www.simplilearn.com/what-is-performance-testing-article#:~:text=Here%20are%20some%20benefits%20of%20performance%20testing%20and,features%20of%20the%20new%20software%20Meer%20items...%20
[^2]:https://www.guru99.com/performance-testing-tools.html