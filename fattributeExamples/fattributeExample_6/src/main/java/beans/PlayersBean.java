package beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named
@RequestScoped
public class PlayersBean {

    private String playerName;
    private String playerSurname;

    public PlayersBean() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerSurname() {
        return playerSurname;
    }

    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }

    public void parametersAction(ActionEvent evt) {
        playerName = (String) evt.getComponent().getAttributes().get("playerNameAttr");
        playerSurname = (String) evt.getComponent().getAttributes().get("playerSurnameAttr");

        System.out.println(playerName + "  " + playerSurname);
    }

}
