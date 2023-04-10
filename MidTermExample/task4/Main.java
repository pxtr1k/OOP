public class Main {
    public static void main(String[] args)
            throws Exception {
        Game g1 = null;
        Game g2 = null;
        VideoGame vg1 = null;
        VideoGame vg2 = null;
        try (Game g3 = new Game(10, "NFS")) {
            g1 = new VideoGame(100, "COD");
            vg1 = new VideoGame(0, "Cyberpunk 2077");
            vg2 = new VideoGame(3, "Minecraft");
            g2 = new Game(20, "Risk");
        }
        catch (NoCopiesException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Game sales exception");
        }
        finally {
            System.out.println("Setup done");
            vg1 = new VideoGame(50, "Grim Dawn");
        }
        try {
            vg1.buyGame(5);
            vg2.buyGame(60);
            g1.buyGame(7);
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        finally {
            System.out.println("Sale finished!");
            ((Game) vg1).close();
        }
        g1.buyGame(7);
        System.out.println(g1.numberOfCopies);
    }
}
