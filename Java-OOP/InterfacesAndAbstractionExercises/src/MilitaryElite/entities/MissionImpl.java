package MilitaryElite.entities;

import MilitaryElite.interfaces.Mission;

public class MissionImpl implements Mission {
    public enum Status{
        IN_PROGRESS("inProgress"),
        FINISHED("finished");
        private String status;

        Status(String status) {
            this.status = status;
        }

    }
    private String codeName;

    private Status status;
    public MissionImpl(String codeName, Status status) {
        this.codeName = codeName;
        this.status = status;
    }

    @Override
    public void completeMission() {
        this.status= Status.FINISHED;
    }
}
