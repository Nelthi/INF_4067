package lsp.bad;

/**
 * MAUVAIS DESIGN (viole LSP) : un carré « est un » rectangle en géométrie, mais
 * il ne respecte pas le contrat de Rectangle : après setWidth(), la hauteur
 * ne doit pas changer. Square ne peut pas se substituer à Rectangle.
 */
public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
