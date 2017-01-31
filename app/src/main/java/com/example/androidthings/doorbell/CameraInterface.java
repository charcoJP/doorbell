package com.example.androidthings.doorbell;

import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import android.widget.ImageView;

/**
 * Created by mhidaka on 2015/11/09.
 */
public interface CameraInterface {
    ImageView getSurfaceTextureFromTextureView();
    Size getPreviewSize();
    Handler getBackgroundHandler();
    Surface getImageRenderSurface();
    int getRotation();
}