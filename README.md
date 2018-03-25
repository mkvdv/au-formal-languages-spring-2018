# au-formal-languages-spring-2018

## Lexer
Я добавил целочиселнные литералы, ибо в примере в задании они есть, 
и они не подходят под требования для floating literals из java.

Тестовые файлыinstall_gradle в `src/main/resources/ok` и `src/main/resources/fails`.


### Сборка и запуск
Требования:
* Java 8
* gradle
* ANTLR4 (если нужно заново сгененрировать L_Lexer.java)

```
chmod +x install_gradle_and_antlr.sh
sudo ./install_gradle_and_antlr.sh # load gradle using apt

...
gradle build
chmod +x run.sh # launch gradle with path to test file
./run.sh src/main/resources/ok/ok1 # or other path to file

```