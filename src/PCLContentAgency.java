import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PCLContentAgency {
    private DiscussionTopic update;

    private PropertyChangeSupport support;

    public PCLContentAgency() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
    public void setContent(String value) {
        DiscussionTopic newUpdate = new DiscussionTopic(update.NameAuthor, update.Topic, value);
        support.firePropertyChange("Content", this.update, newUpdate);
        this.update = newUpdate;
    }
    public void setNewTopic(DiscussionTopic value) {
        support.firePropertyChange("Content", this.update, value);
        this.update = value;
    }
    public String getUpdate() {
        return update.toString();
    }
    public void setUpdate(DiscussionTopic up){
        update = up;
    }
}
