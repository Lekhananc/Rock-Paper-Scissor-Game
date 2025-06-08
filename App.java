import javax.swing.*;

public class App {
    public static void main(String[] args) {
        /*Swing is not thread save that means it cannot run side by side to another application
        * So there is this special thread called EDT event dispatch thread
        * all the UI operations like a button click or layout or size modification is handled here
        * whatever GUI creation and updation task it has to be done inside EDT
        * or else it can cause issues like app not loading, app crashing or freezing or casing some layout issues
        * so we use Swing Utilities invoke later method it does the task of creating GUI object in EDT
        *
        * Runnable - it is an interface, and it has exactly one method run() whatever the code defined inside Runnable interface
        * is executed sometime later or in a different thread or at a scheduled time */
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                RockPaperScissorGUI gui = new RockPaperScissorGUI();
                RockPaperScissor logic = new RockPaperScissor();
                logic.rockPaperScissorGUI = gui; // ✅ Set the GUI in the logic class
                gui.rockPaperScissor = logic;     // ✅ Set the logic in the GUI class
                gui.setVisible(true);
            }
        });
    }
}
