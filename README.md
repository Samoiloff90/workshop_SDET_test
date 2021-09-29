<h4 align="center">
  Зададние для воркшопа по SDET
</h4>

Для запуска тестов необходимо выбрать вебдрайвер подходящий для вашего браузера и операционной системы.
Переходим в `Config.java` и в переменную `BROWSER_AND_PLATFORM` добавляем подходящий драйвер из списка:
1. **chromedriver-win.exe**
2. **chromedriver-mac**
3. **geckodriver-mac**
4. **geckodriver-win.exe**

Для запуска в несколько потоков, в `BaseTest.java` необходимо раскомментировать строчку: `@Execution(ExecutionMode.CONCURRENT)`


Для запуска Allure отчета выполняем команду:

    $ allure serve target/allure-results
    

**Отчет Allure о пройденных тестах:**
![allure1](https://user-images.githubusercontent.com/50422809/135213032-d746703f-a2cc-4ea8-a5c9-781e063f6473.jpeg)


![allure2](https://user-images.githubusercontent.com/50422809/135213254-bcea2e14-b546-4a68-ad82-91ff5ae336f7.jpeg)
