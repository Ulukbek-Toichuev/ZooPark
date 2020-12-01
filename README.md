## ШколаНТ_ДЗ_№04_Тойчуев
**Список задач которые нужно было выполнить:**
- Создать зоопарк, для животных реализовать иерархию классов.
    - Был создан класс Animal, от него наследовались 2 класса (**Carnivorous**, **Herbivore**), а в свою очеред от них было создано 6 наследников.
- Создать аналогичную архитектуру для классов еды.
    - Так же был создан класс **Food**, от которого наследовались 2 класса (**Meat**, **Grass**).
- Создать интерфейсы определяющие поведение животных.
    - Было создано 4 интерфейся по требованию а так же дополнен 1им (**Run**, **Swim**, **Fly**, **Voice**, **Walk**).
- Классы животных должны реализовывать соответствующие интерфейсы.
    - Сделано.
- В классе **Animal** должен быть метод **eat(Food food)**, который принимает в качестве аргумента еду. 
    - Сделано.
- Данный метод должен быть переопределен в классах наследниках.
    - Переопределен в классах наследниках (Carnivorous, Herbivore) и в классах конкретных животных.
- Если переданная еда не подходит животному (хищники не едят траву, травоядные не едят мясо), то на экран должно быть выведено соответствующее предупреждение. Проверку на соответствие типа еды выполнять через instanceof.
    - В каждом классе наследнике было реализован такой метод (в самом низу классов).
- Создать класс рабочего зоопарка (Worker).
    - Создан в корневой папке.
- Создать методы: **feed(…)** – покормить любое животное любой едой. У метода должно быть два параметра – животное и еда.
    - Создано.
- Создать метод: **getVoice(…)** – заставить животное подать голос (вывести на экран то, что говорит конкретное животное). У метода должен быть один параметр – животное, которое издает звук. Метод должен принимать в качестве аргумента только тех животных, которые могут издавать звуки.
    - Создано.
- В корневом каталоге программы должен быть класс **Zoo** c точкой входа в программу.
    - Создано.
- Необходимо создать объекты классов животных, еды, работника зоопарка.
    - Были созданы объекты животных (**bear**, **duck**, **fish**, **hippo**, **horse**, **lion**), были созданы объекты еды (**food**, **meat**, **grass**), был создан объект работника (**mike**).
- Так же создать пруд – массив с животными которые умеют плавать.
    - Создано.
- В пруду может быть несколько животных одного типа, но типов (различных классов) должно быть не менее двух. В цикле вызвать метод **swim()** у каждого животного из массива.
    - В массиве 2 вида животных (5 в общем), вызов метода **swim()** происходит без цикла (пока я не знаю как его реализовать).
- Добавить на ваше усмотрение необходимые поля класса и логику методов.
    - Создан интерфейс **Walk** (так как животные не бегают всегда). При вызове метода **eat()** для каждого животного, генерируется одна из двух видов строки с едой. Создан в классе **Zoo** метод **drawALine()**, который при помощи цикла **for()** отделяет одно поведение от другого.