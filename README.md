# au-formal-languages-spring-2018

## Parser
Добавлена запятая, чтобы поддержать список аргументов функции.
Программа может быть пустой (это валидно исходя из задания, P = {D*, S}, а S = S* | ...)

Тестовые файлы в `src/main/parser_tests/resources/ok` и `src/main/resources/parser_tests/fail`.

### Добавленный синтаксический сахар
* присваивание переменных как пар, то есть `a, b := 1, 2`, пример в `ok5`
* добавлен инкремент `i++`, который рассахаривается в `i := i + 1` (это `statement`, not `expr`) пример в `ok6`
* добавлен декремент `i--`, пример в `ok6`
* возможность писать `if` без `else`, пример в `ok7`

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