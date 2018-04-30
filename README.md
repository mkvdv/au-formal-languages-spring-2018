# au-formal-languages-spring-2018

## Lexer
Я добавил целочиселнные литералы, ибо в примере в задании они есть, 
и они не подходят под требования для floating literals из java.

Тестовые файлы в `src/main/resources/ok` и `src/main/resources/fails`.


### Сборка и запуск
Требования:
* Java 8 (openjdk ставится скриптом, если у вас Ubuntu)
* gradle (и он тоже)
* ANTLR4 (если нужно заново сгененрировать L_Lexer.java -- он тоже ставится скриптом) `теперь он качается не через apt`

```
chmod +x install_java_gradle_antlr.sh
sudo ./install_java_gradle_antlr.sh # load gradle using apt

### after installation

chmod +x run.sh # launch gradle with path to test file
./run.sh src/main/resources/parser_tests/ok/ok1 # or other path to file
```