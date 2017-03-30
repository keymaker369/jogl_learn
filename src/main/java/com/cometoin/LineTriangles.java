package com.cometoin;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLJPanel;

import java.awt.*;

public class LineTriangles implements GLEventListener {
    @Override
    public void init(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void dispose(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();

        gl.glBegin(GL2.GL_TRIANGLES);        // Drawing Using Triangles

        gl.glVertex3f(0.5f,0.7f,0.0f);       // Top
        gl.glVertex3f(-0.2f,-0.50f,0.0f);    // Bottom Left
        gl.glVertex3f(0.5f,-0.5f,0.0f);      // Bottom Right

        gl.glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }

    public static void main(String[] args) {

        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);

        // The canvas
        GLJPanel gljpanel = new GLJPanel( capabilities );
        LineTriangles l = new LineTriangles();
        gljpanel.addGLEventListener(l);
        gljpanel.setSize(400, 400);

        //creating frame
        final Frame frame = new Frame (" Basic Frame");

        //adding canvas to frame
        frame.add(gljpanel);
        frame.setSize( 640, 480 );
        frame.setVisible(true);
    }

}