package streda_16_35_c05.renderer;

import streda_16_35_c05.rasterize.Raster;
import transforms.Mat4;

public class RendererZBuffer implements GPURenderer {

    private final Raster<Integer> imageRaster;

    public RendererZBuffer(Raster<Integer> imageRaster) {
        this.imageRaster = imageRaster;
    }

    @Override
    public void draw() {

    }

    @Override
    public void clear() {

    }

    @Override
    public void setModel(Mat4 model) {
        // TODO
    }

    @Override
    public void setView(Mat4 view) {
        // TODO
    }

    @Override
    public void setProjection(Mat4 projection) {
        // TODO
    }

}
