public class DiscussionTopic {
    public String NameAuthor;
    public String Topic;
    public String Content;

    DiscussionTopic(String nameAuthor, String topic, String content){
        NameAuthor = nameAuthor;
        Topic = topic;
        Content = content;
    }
    DiscussionTopic(String nameAuthor, String topic){
        NameAuthor = nameAuthor;
        Topic = topic;
    }
    @Override
    public String toString(){
        return "Автор: " + NameAuthor + "\n" +
                "Тема: " + "\"" + "Topic" + "\"\n" +
                Content;
    }
}
