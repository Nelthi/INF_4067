# INF4067 - Principes SOLID

Chaque dossier `code/<sujet>/` contient deux sous-dossiers :
- `bad` : implémentation qui viole le principe ;
- `good` : implémentation corrigée.

Les schémas UML (PlantUML) sont dans `docs/uml/`.

## Lancer un exemple

Depuis la racine du projet, remplacer `<sujet>` par : `payment`, `cohesion`, `srp`, `ocp`, `lsp`, `isp` ou `dip`.

```bash
# version bad
cd code/<sujet>/bad
javac *.java
java Main

# version good (depuis le dossier bad)
cd ../good
javac *.java
java Main
```

## Commandes pour chaque exemple

```bash
# Payment
cd code/payment/bad  && javac *.java && java Main
cd code/payment/good && javac *.java && java Main

# Cohésion / couplage
cd code/cohesion/bad  && javac *.java && java Main
cd code/cohesion/good && javac *.java && java Main

# SRP
cd code/srp/bad  && javac *.java && java Main
cd code/srp/good && javac *.java && java Main

# OCP
cd code/ocp/bad  && javac *.java && java Main
cd code/ocp/good && javac *.java && java Main

# LSP
cd code/lsp/bad  && javac *.java && java Main
cd code/lsp/good && javac *.java && java Main

# ISP
cd code/isp/bad  && javac *.java && java Main
cd code/isp/good && javac *.java && java Main

# DIP
cd code/dip/bad  && javac *.java && java Main
cd code/dip/good && javac *.java && java Main
```

Chaque ligne `cd code/...` part de la racine du projet (revenir avec `cd ../../..`).
