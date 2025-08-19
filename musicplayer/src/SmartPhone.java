public class SmartPhone implements VideoPlayer, MusicPlayer {
    @Override
    public void playVideo() {
        System.out.println("SP Playing video");
    }
    @Override
    public void pauseVideo() {
        System.out.println("SP Pausing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("SP Stopping video");
    }

    @Override
    public void playMusic() {
        System.out.println("SP Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("SP Pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("SP Stopping music");
    }
}
