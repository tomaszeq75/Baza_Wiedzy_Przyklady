package mediator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ActionAppliedMessage implements Component {

    private Mediator mediator;

    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    public void displayInfo() {
        System.out.println("Action was applied successfully");
    }

    @Override
    public void sendRequest() {
        mediator.sendInfo(this, "ActionAppliedMessage");
    }
}
