package javaman.gobject;
import henry.game.*;
import javaman.ginterface.IConstant;
import javaman.sound.MusicPlayer;
/**
 * @author henry
 * www.riabbs.com
 *
 * @version 1.0
 */
abstract public class Board extends Sprite  implements IConstant{
  private boolean enableLoadMan=true;
  protected MusicPlayer musicplayer=MusicPlayer.getInstance();
  public Board() {
  }

  public boolean isEnableLoadMan() {
    return enableLoadMan;
  }
  public void setEnableLoadMan(boolean enableLoadMan) {
    this.enableLoadMan = enableLoadMan;
  }
  public abstract void whenCollideWithMan(JMan jman);

}
