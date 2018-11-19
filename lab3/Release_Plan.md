## SWEN2 - Release-Plan



| US02   | Als Parkplatzbenutzer möchte ich einen gültigen Geldbetrag einwerfen, um mein Fahrzeug für einen Zeitraum parkiert zu haben. |         |
| ------ | ------------------------------------------------------------ | ------- |
| Task 1 | Datenstruktur definieren                                     | 4h      |
| Task 2 | Prozess definieren                                           | 8h      |
| Task 3 | Münzerkennung implementieren                                 | 16h     |
| Task 4 | GUI anhand des Prozesses planen                              | 4h      |
| Task 5 | Zeitberechnung implementieren                                | 8h      |
| Total  |                                                              | **40h** |



| US04   | Als Parkplatzbenutzer möchte ich einen Zahlungsbeleg erhalten, d.h. eine schriftliche Bestätigung in der Hand zu haben. |        |
| ------ | ------------------------------------------------------------ | ------ |
| Task 1 | Zahlungsbelegformat implementieren                           | 4h     |
| Task 2 | Druck implementieren                                         | 4h     |
| Total  |                                                              | **8h** |



| US06   | Als Wartungspersonal möchte ich den Münzbestand einstellen, um die Parkuhr zurücksetzen zu können. |         |
| ------ | ------------------------------------------------------------ | ------- |
| Task 1 | Datenstruktur für Münzbestand definieren                     | 4h      |
| Task 2 | Prozess definieren                                           | 8h      |
| Task 3 | GUI anhand des Prozesses planen                              | 4h      |
| Task 4 | Prozess implementieren                                       | 20h     |
| Total  |                                                              | **36h** |



**Velocity**

| User Story | Geschätzte Story Points |
| ---------- | ----------------------- |
| 2          | 8                       |
| 6          | 5                       |
| Total      | 13 = Velocity           |



**Release Plan**

Der Release Plan wurde anhand der Velocity-Rechnung und der Prioritätenschätzung erstellt. Nicht ausgenutzte Kapazitäten können als Buffer betrachtet werden. In dieser Bufferzeit wird entweder an Tasks gearbeitet, welche mehr Aufwand benötigen als geplant oder bereits an einer User Story der nächsten Iteration.



| Iteration 1     | Iteration 2    | Iteration 3    | Iteration 4    |
| --------------- | -------------- | -------------- | -------------- |
| US02            | US03           | US07           | US01           |
| US06            | US04           | US08           |                |
|                 | US05           | US09           |                |
|                 |                |                |                |
| 13 Story Points | 7 Story Points | 9 Story Points | 8 Story Points |



**Vertiefungsfragen**

- Warum ist es wichtig einen Release Plan zu erstellen? Begründen Sie Ihre Antwort.
  - So kann man dem Kunden ständig zeigen, zu welchem Datum er was erhält. Wichtig ist hierbei die XP Practice Small Releases zu befolgen.