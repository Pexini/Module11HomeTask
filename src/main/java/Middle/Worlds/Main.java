package Middle.Worlds;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//Какое слово встречается чаще всего?
//На вход подаётся текст, например отрывок из книги “Война и Мир”
//Нужно определить, какое слово появляется в тексте чаще всего. Используйте для решения задачи коллекции.
//Что это? я падаю! у меня ноги подкашиваются» , — подумал он и упал на спину. Он раскрыл глаза, надеясь увидать, чем кончилась борьба французов с артиллеристами, и желая знать,
// убит или нет рыжий артиллерист, взяты или спасены пушки. Но он ничего не видал. Над ним не было ничего уже, кроме неба, — высокого неба, не ясного, но все-таки неизмеримо высокого,
// с тихо ползущими по нем серыми облаками. «Как тихо, спокойно и торжественно, совсем не так, как я бежал, — подумал князь Андрей, — не так, как мы бежали, кричали и дрались; совсем не так,
// как с озлобленными и испуганными лицами тащили друг у друга банник француз и артиллерист, — совсем не так ползут облака по этому высокому бесконечному небу. Как же я не видал прежде
// этого высокого неба? И как я счастлив, что узнал его наконец. Да! все пустое, все обман, кроме этого бесконечного неба. Ничего, ничего нет, кроме его. Но и того даже нет, ничего нет,
// кроме тишины, успокоения. И слава Богу!.. »


        String text = "Что это? я падаю! у меня ноги подкашиваются» , — подумал он и упал на спину. Он раскрыл глаза, надеясь увидать, чем кончилась борьба французов с артиллеристами, и желая знать,\n" +
                "убит или нет рыжий артиллерист, взяты или спасены пушки. Но он ничего не видал. Над ним не было ничего уже, кроме неба, — высокого неба, не ясного, но все-таки неизмеримо высокого,\n" +
                "с тихо ползущими по нем серыми облаками. «Как тихо, спокойно и торжественно, совсем не так, как я бежал, — подумал князь Андрей, — не так, как мы бежали, кричали и дрались; совсем не так,\n" +
                "как с озлобленными и испуганными лицами тащили друг у друга банник француз и артиллерист, — совсем не так ползут облака по этому высокому бесконечному небу. Как же я не видал прежде\n" +
                "этого высокого неба? И как я счастлив, что узнал его наконец. Да! все пустое, все обман, кроме этого бесконечного неба. Ничего, ничего нет, кроме его. Но и того даже нет, ничего нет,\n" +
                "кроме тишины, успокоения. И слава Богу!..";

        text = text.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").toLowerCase();

        String[] words = text.split("\\s+");

        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        String mostFrequentWord = null;
        int maxFrequentWord = 0;
        for (Map.Entry<String,Integer> entry:wordMap.entrySet()){
            if (entry.getValue() > maxFrequentWord){
                maxFrequentWord = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        System.out.println("Most frequent word - " + mostFrequentWord);
        System.out.println(" Times " + maxFrequentWord);

    }
}
