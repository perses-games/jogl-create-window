package com.persesgames.jogl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.media.opengl.GL;
import javax.media.opengl.GL2ES2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

/**
 * Date: 10/25/13
 * Time: 7:42 PM
 */
public class Renderer implements GLEventListener  {
    private final static Logger logger = LoggerFactory.getLogger(Renderer.class);

    @Override
    public void init(GLAutoDrawable drawable) {
        logger.info("init (" + Util.getTime() + ")");

        GL2ES2 gl = drawable.getGL().getGL2ES2();

        logger.info("Chosen GLCapabilities: " + drawable.getChosenGLCapabilities());
        logger.info("INIT GL IS: " + gl.getClass().getName());
        logger.info("GL_VENDOR: " + gl.glGetString(GL.GL_VENDOR));
        logger.info("GL_RENDERER: " + gl.glGetString(GL.GL_RENDERER));
        logger.info("GL_VERSION: " + gl.glGetString(GL.GL_VERSION));
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        logger.info("dispose (" + Util.getTime() + ")");

    }

    @Override
    public void display(GLAutoDrawable drawable) {
        logger.info("display (" + Util.getTime() + ")");

        GL2ES2 gl = drawable.getGL().getGL2ES2();

        // drawing code goes here

        drawable.swapBuffers();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int w, int h) {
        logger.info("reshape (" + Util.getTime() + ")");

        GL2ES2 gl = drawable.getGL().getGL2ES2();

        gl.glViewport(0, 0, w, h);
    }

}
