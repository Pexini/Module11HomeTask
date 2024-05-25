<h2>  Модуль 11. Java коллекции. Практика  </h2>
<h3> Вопросы:  </h3> 
<h5> 1. Что такое коллекции в java и для чего они используются? </h5>
<br>
<strong> Коллекции </strong> —  это динамические типы для хранения однотипных групп объектов, предназначенные для удобного хранения, управления и манипулирования данными. Коллекции в Java предоставляют удобные методы для добавления, удаления, поиска и обработки элементов, а также поддерживают различные алгоритмы и операции для работы с данными.<br>
<ol> 
Например коллекции используются в Java:
<li> списки <i> 'List'</i> - могут содержать упорядоченные последовательности элементов. <br></li>
<li> множества <i> 'Set' </i> - уникальные элементы без повторений. <br></li>
<li> карта <i> 'Map' </i> предоставляет механизм для хранения пар "ключ-значение".<br></li>
</ol>

<h5> 2. Назовите 3 основных интерфейса, которые наследуются от интерфейса Collection в java? </h5>
<ol> 
<li> <strong> Set :</strong> Интерфейс Set представляет собой коллекцию уникальных элементов, то есть каждый элемент может встречаться не более одного раза. Основные реализации включают <strong> HashSet </strong>, <strong> LinkedHashSet </strong> и  <strong> TreeSet </strong>. <br></li>
<li> <strong> List: </strong> Интерфейс List представляет собой упорядоченную коллекцию объектов, в которой каждый элемент имеет свой индекс. Дубликаты допускаются. Основные реализации включают <strong> ArrayList</strong>,  <strong> LinkedList</strong> и <strong> Vector </strong>.<br></li>
<li> <strong> Queue: </strong> Интерфейс Queue представляет собой коллекцию элементов, в которой элементы добавляются в конец и удаляются из начала. Основные реализации включают <strong> LinkedList  (как двунаправленную очередь) </strong> и <strong> PriorityQueue </strong>. <br></li>
</ol>

<h5> 3. Назовите отличия реализаций ArrayList от LinkedList.</h5>
<ol>
<h6> Структура данных: </h6>
<strong> ArrayList: </strong> Реализован на основе динамического массива. При достижении предельного размера массива он увеличивается путем создания нового массива большего размера и копирования элементов. <br>
<strong> LinkedList: </strong> Реализован на основе двусвязного списка, где каждый элемент (Node) содержит ссылки на предыдущий и следующий элементы. <br> 

<h6> Когда использовать:<br></h6>
<strong> ArrayList: </strong> Лучше подходит, если часто требуется доступ по индексу или требуется компактное использование памяти. Хорошо подходит для сценариев, когда операции вставки и удаления выполняются редко или в конце списка.
<strong> LinkedList: </strong> Предпочтителен, если часто требуется вставка и удаление элементов в середине списка или если важнее производительность операций вставки и удаления, чем доступ по индексу. <br>
</ol>

![Отличие ArrayList от LinkedList ](https://github.com/Pexini/Module11HomeTask/blob/main/differentsArrayandList.png)

<h5> 4. Что такое множества? Какие есть реализации интерфейса Set в java?</h5>
<ol> 
Множества в Java представляют собой коллекции, которые содержат только уникальные элементы, то есть каждый элемент может встречаться в множестве не более одного раза. Это отличает их от списков, которые могут содержать дублирующиеся элементы.
<br>
<li> HashSet - основанная на хеш-таблице. Она обеспечивает почти постоянное время выполнения для операций добавления, удаления и проверки наличия элемента. <br> </li>
<li> Treeset - основанная на красно-черном дереве. Элементы в TreeSet хранятся в отсортированном порядке. Эта реализация обеспечивает гарантированное время выполнения для основных операций (вставка, удаление, поиск) в O(log n).  <br> </li>
<li> LinkedHashSet - объединяет функциональность HashSet и связанного списка. Она поддерживает порядок вставки элементов, а также обеспечивает почти постоянное время выполнения для операций добавления, удаления и проверки наличия элемента, подобно HashSet. <br> </li>
<i> HashSet обычно является предпочтительным выбором, если важна быстрая проверка наличия элемента, в то время как TreeSet может быть полезен, если требуется сохранение элементов в отсортированном порядке. </i>
</ol>



