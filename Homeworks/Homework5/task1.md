Задание 1:

Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.

Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

Ответ:

1. Юнит-тесты.
   - Проверка класса Контакты на создание объекта с правильными данными.
   - Проверка класса Репозиторий на добавление в него объекта класса Контакты. Вместо объекта класса Контакты можно использовать mock.
   - Проверка класса Репозиторий на удаление из него объекта класса Контакты. Вместо объекта класса Контакты можно использовать mock.
   - Проверка класса Репозиторий на редактирование в нем объекта класса Контакты. Вместо объекта класса Контакты можно использовать mock.
   - Проверка класса Сервис на вызов нужного метода в объекте класса Репозиторий при добавлении объекта класса Контакты. Вместо объекта класса Репозиторий можно использовать mock.
   - Проверка класса Сервис на вызов нужного метода в объекте класса Репозиторий при удалении объекта класса Контакты. Вместо объекта класса Репозиторий можно использовать mock.
   - Проверка класса Сервис на вызов нужного метода в объекте класса Репозиторий при редактировании объекта класса Контакты. Вместо объекта класса Репозиторий можно использовать mock.
2. Интеграционные тесты
   - Проверка взаимодействия классов Контакты и Репозиторий. Можно использовать fake.
   - Проверка взаимодействия классов Репозиторий и Сервис.
   - Проверка взаимодействия всех трех репозиториев вместе. Можно использовать fake.
3. Сквозные тесты
   - Проверить через интерфейс пользователя добавление Контакта в систему.
   - Проверить через интерфейс пользователя удаления Контакта из системы.
   - Проверить через интерфейс пользователя редактирования Контакта в системе.