package rooms;

import players.Player;

import java.util.ArrayList;

public abstract class Room {

    private int roomNumber;
    private ArrayList<Player> playersInTheRoom;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.playersInTheRoom = new ArrayList<Player>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public ArrayList<Player> getPlayersInTheRoom() {
        return playersInTheRoom;
    }

    public int getPlayerCount() {
        return playersInTheRoom.size();
    }

}
