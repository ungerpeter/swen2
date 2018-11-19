## SWEN2 - Story-Points



**Administrator**

------

3								Münzbestand überwachen									8

Als Administrator möchte ich den Münzbestand überwachen, um zu wissen, wie voll das Münzfach einer Parkuhr ist.

< Risiko >						US01										< Story Points > (PS)

------



**Parkplatzbenutzer**

------

1								Fahrzeug parkieren											8

Als Parkplatzbenutzer möchte ich einen gültigen Geldbetrag einwerfen, um mein Fahrzeug für einen Zeitraum parkiert zu haben.

< Risiko >						US02										< Story Points > (PS)

Rückseite: Angenommen die Parkplatznummer wurde erfolgreich geprüft, wenn ich den Münzbetrag einwerfe, dann sehe ich die bezahlte Parkzeit. Angenommen ich werfe nicht vorgesehene Münzen ein, wenn ich zum Zahlen aufgefordert werde, dann erhalte ich die soeben eingeworfenen Münzen wieder zurück. Angenommen ich werfe zu viel Geld ein, wenn ich den Parkplatz bezahle, dann erhalte ich den Restbetrag wieder.

------



------

2								Vorhandene Parkzeit kontrollieren								2

Als Parkplatzbenutzer möchte ich sehen, wie lange mein Parkplatz noch gedeckt ist, um zu wissen, wann ich spätestens wieder losfahren muss..

< Risiko >						US03										< Story Points > (PS)

Rückseite: Angenommen der Parkplatz ist besetzt, wenn ich die Zeit abfragen will, dann sehe ich die verbleibende bezahlte Zeit.

------



------

1								Ausgabe des Zahlungsbelegs									3

Als Parkplatzbenutzer möchte ich einen Zahlungsbeleg erhalten, d.h. eine schriftliche Bestätigung in der Hand zu haben.

< Risiko >						US04										< Story Points > (PS)

Rückseite: Angenommen ich erhalte den Zahlungsbeleg, nachdem ich die Zahlung durchführte, dann sehe ich das Datum, denPreis (inkl. und exkl. Mehrwertsteuer) und die bezahlte Zeit.

------



**Wartungspersonal**

------

2								Liste der Parkplätze erhalten									2

Als Wartungspersonal möchte ich eine Liste aller Parkplätze inkl. bezahlte Zeit sehen, um einen schnellen Überblick über die Auslastung der Parkplätze zu erhalten.

< Risiko >						US05										< Story Points > (PS)

Rückseite: Angenommen ich tippe die Kombination 4321 ein, wenn ich die Parkuhr bediene, dann sehe ich eine Übersicht aller Parkplätze der Parkplatznummer nach sortiert mit aktuellem Datum und der bezahlten Parkzeit. Angenommen die bezahlte Parkzeit wurde überschritten, wenn ich die Übersicht abfrage, dann soll die überschrittene Zeit angezeigt werden.

------



------

1								Münzbestand einstellen										5

Als Wartungspersonal möchte ich den Münzbestand einstellen, um die Parkuhr zurücksetzen zu können.

< Risiko >						US06										< Story Points > (PS)

Rückseite: Angenommen ich tippe die Kombination 4545 in die Parkuhr ein, wenn ich sie bediene, dann kann ich neue Münzbestände eingeben. Angenommen ich möchte einen Bestand über 100 einstellen, wenn ich die Münzbestände bestimme, dann wird eine Fehlermeldung angezeigt. Angenommen ich beende den Ablauf, wenn ich die Münzbestände einstelle, dann sehe ich eine Übersicht der Gesamtbeträge pro Münztyp.

------



------

3								Transaktionslog anzeigen										2

Als Wartungspersonal möchte ich ein Log aller Transaktionen einer Parkuhr sehen können, damit ich die Auslastung der Uhr prüfen kann.

< Risiko >						US07										< Story Points > (PS)

Rückseite: Angenommen ich tippe die Kombination 1234 in die Parkuhr ein, wenn ich sie bediene, dann sehe ich das Transaction Log der Parkuhr. Angenommen das Log wird angezeigt, wenn ich die Kombination eingebe, dann sehe ich für jeden Zahlung den bezahlten Betrag, den betroffenen Parkplatz, welche Münzen verwendet wurden, die bezahlte Parkzeit und den aktuellen Zeitpunkt.

------



------

3								Informationsübersicht										2

Als Wartungspersonal möchte ich eine Übersicht aller wichtiger Informationen (Gesamtbetrag pro Münzeinheit, die Tabelle der Parkzeitdefinitionen, ein Test der Zeitberechnung und die Transaktionsanzeige) sehen, damit ich die Konfiguration der Parkuhr prüfen kann.

< Risiko >						US08										< Story Points > (PS)

Rückseite: Angenommen ich tippe die Kombination 9876 in die Parkuhr ein, wenn ich die Parkuhr bediene, dann wird die Übersicht aller wichtiger Informationen angezeigt.

------



------

2								Parkuhr testen												5

Als Wartungspersonal möchte ich die Parkuhr testen können, um die Funktionalität der Parkuhr zu gewährleisten.

< Risiko >						US09										< Story Points > (PS)

Rückseite: Angenommen ich tippe die Kombination 8888 in die Parkuhr ein, wenn ich die Parkuhr bediene, dann wird der Test gestartet, welcher einen Münzanfangsbestand, das Parkieren und die Zeitberechnung simuliert..

------



**Vertiefungsfragen**

- Warum ist es besser Story Points einer Schätzung in Stunden vorzuziehen?
  - Weil dies agil ist und jederzeit interveniert werden kann. Es ist beispielsweise besser zwei bis drei Stunden zu verlieren, als zwei bis drei Tage.
- Wer sollte am Planning Poker teilnehmen
  - Projektleiter, Entwickler
- Wann macht es Sinn ein Planning Poker durchzuführen
  - Vor jedem neuen Sprint 
- Warum glauben Sie das Planning Poker gut funktioniert? Begründen Sie Ihre Antwort..
  - Weil gemeinsam ausdiskutiert wird, wie lange etwas dauern kann. Mehrere Meinungen und Erfahrungs-Level treffen aufeinander und können somit den Aufwand von einer Arbeit gut abschätzen.
- Warum ist es wichtig eine Priorisierung vorzunehmen
  - Wichtige Tasks / Deadlines werden eher berücksichtigt -> Kunde ist zufrieden.