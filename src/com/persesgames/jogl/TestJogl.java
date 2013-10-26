package com.persesgames.jogl;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.util.FPSAnimator;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;

/**
 * Date: 10/25/13
 * Time: 7:27 PM
 */
public class TestJogl {

    public static void main(String [] args) {
        TestJogl test = new TestJogl();

        test.startRendering();
    }

    private final GLWindow glWindow;

    public TestJogl() {
        GLCapabilities caps = new GLCapabilities(GLProfile.get(GLProfile.GL2ES2));

        caps.setDoubleBuffered(true);

        glWindow = GLWindow.create(caps);

        glWindow.setTitle("jogl-create-window");

        //glWindow.setSize(glWindow.getWidth(), glWindow.getHeight());
        glWindow.setSize(800, 600);

        glWindow.setFullscreen(false);
        glWindow.setUndecorated(false);
        glWindow.setPointerVisible(true);
        glWindow.setVisible(true);

        glWindow.addGLEventListener(new Renderer());
    }

    public void startRendering() {
        final FPSAnimator animator = new FPSAnimator(glWindow, 60);
        animator.start();

        glWindow.setWindowDestroyNotifyAction(new Runnable() {
            @Override
            public void run() {
                animator.stop();
            }
        });
    }

}
