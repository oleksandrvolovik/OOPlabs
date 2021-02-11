package lab3;

/*
    Номер залікової - 0206
    C3 = 206 % 3 = 2 -> Тип - String
    C17 = 206 % 17 = 2 -> Дія з рядком - Знайти таке слово в першому реченні заданого тексту,
    якого не має в жодному з наступних.
 */

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Rhoncus dolor lorem purus non enim praesent elementum facilisis leo vel. Ipsum egestas dui id  ornare arcu.";
        String[] sentences = text.split("\\.|!|\\?");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].replaceAll("\\p{Punct}", "");
        }
        boolean unique = false;
        for (String firstSentenceWord : sentences[0].split(" ")) {          //For each word in 1 sentence
            unique=true;
            l:for (int i = 1; i < sentences.length; i++) {
                for (String sentenceWord : sentences[i].split(" ")) {
                    if (firstSentenceWord.equalsIgnoreCase(sentenceWord)) {
                        unique = false;
                        break l;
                    }
                }
            }
            if (unique) {
                System.out.println("Слово знайдено! Це - \"" + firstSentenceWord+"\"");
                break;
            }
        }
        if (!unique){
            System.out.println("Слово не знайдено.");
        }
    }
}
