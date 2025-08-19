public class Computer implements MusicPlayer, VideoPlayer
{
    @Override
    public void playMusic() {
        System.out.println("PC Playing music");
    }

    @Override
    public void pauseMusic() {
System.out.println("PC Pausing music");
    }

    @Override
    public void stopMusic() {
System.out.println("PC Stopping music");
    }

    @Override
    public void playVideo() {
System.out.println("PC Playing video");
    }

    @Override
    public void pauseVideo() {
System.out.println("PC Pausing video");
    }

    @Override
    public void stopVideo() {
System.out.println("PC Stopping video");
    }
}
