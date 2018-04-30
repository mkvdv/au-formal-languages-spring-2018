# au-formal-languages-spring-2018

## Parser
Добавлена запятая, чтобы поддержать список аргументов функции.
Программа может быть пустой (это валидно исходя из задания, P = {D*, S}, а S = S* | ...)

Тестовые файлы в `src/main/parser_tests/resources/ok` и `src/main/resources/parser_tests/fail`.


### Сборка и запуск
Требования:
* Java 8 (openjdk ставится скриптом, если у вас Ubuntu)
* gradle (и он тоже)
* ANTLR4  теперь он качается __не__ через apt

```
chmod +x install_java_gradle_antlr.sh
sudo ./install_java_gradle_antlr.sh # load gradle using apt

### after installation

chmod +x run.sh # launch gradle with path to test file
./run.sh src/main/resources/parser_tests/ok/ok1 # or other path to file
```