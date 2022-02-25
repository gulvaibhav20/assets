// ***(Right side of the Bridge)***

// Implementor
interface IResource {
   public void snippet();
}

// Concrete Implementor 1
class Artist implements IResource {
   @Override
   public void snippet() {
      System.out.println("Artist's Snippet is here !!!");
   }
}

// Concrete Implementor 2
class Album implements IResource {
   @Override
   public void snippet() {
      System.out.println("Hola !!!, This is my Album Description ...");
   }
}

// ***(Left side of the Bridge)***

// Abstraction
abstract class View {
   protected IResource resource;

   protected View(IResource resource){
      this.resource = resource;
   }
   public abstract void show();
}

// Concrete Abstraction
class LongView extends View {
   public LongView(IResource resource) {
      super(resource);
   }
   public void show() {
      resource.snippet();
   }
}

// ***Driver Code***
class BridgePattern {
   public static void main(String[] args) {
      IResource my_artist = new Artist();
      View artist_view = new LongView(my_artist);

      IResource my_album = new Album();
      View album_view = new LongView(my_album);
      artist_view.show();
      album_view.show();
   }
}
