import java.lang.Object;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PCLContentAgency observable = new PCLContentAgency();
        PCLContentChannel observer = new PCLContentChannel();
        PCLContentChannel observer2 = new PCLContentChannel();

        System.out.println("< Наблюдатель 1 >");
        observable.addPropertyChangeListener(observer);

        observable.setNewTopic(new DiscussionTopic("Никифоров Семен",
                "Эвдемонизм – этическое учение Античности", "Скоро напишу сообщение, не отписывайтесь"));
        System.out.println(observer.getContent());
        System.out.println("--- новое сообщение ---");
        observable.setContent("Всё ещё не написал, но осталось чуть-чуть");
        System.out.println(observer.getContent());
        System.out.println("< Наблюдатель 1 />");
    }
}

