import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    private String isDownImage;
    private String isUpImage;
  
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile, String img1, String img2)
    {
        key = keyName;
        sound = soundFile;
        isUpImage = img1;
        isDownImage = img2;
        setImage(isUpImage);
        isDown=false;
    }

    /**
     * Do the action for this key.
     */
    public void act()
{
    if ( !isDown && Greenfoot.isKeyDown(key) ) {
            setImage(isDownImage);
            isDown=true;
            play();
        }
    if ( isDown && !Greenfoot.isKeyDown(key) )
    {
        setImage(isUpImage);
        isDown=false;
    }
}
/**
 * Play the note of this key.
 */
 public void play()
 {
  Greenfoot.playSound(sound);  
 }
}