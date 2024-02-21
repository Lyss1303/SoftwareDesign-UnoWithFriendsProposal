package unowithfriends.proposal; 

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;


public class UnoWithFriendsTest {
    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        User1 user1 = new User1();
        user1.startConnection("127.0.0.1", 6666);
        String response = user1.sendMessage("hello server");
        assertEquals("hello client", response);
    }
}
