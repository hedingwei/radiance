package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_war implements ResizableIcon {
    

    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Shape clip = null;

        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.1);
((GeneralPath)shape).lineTo(72.0, 27.800001);
((GeneralPath)shape).lineTo(72.0, 98.9);
((GeneralPath)shape).lineTo(0.0, 98.9);
((GeneralPath)shape).lineTo(0.0, 1.1);
((GeneralPath)shape).lineTo(45.0, 1.1);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.125), new Point2D.Double(36.0, 100.875), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.1);
((GeneralPath)shape).lineTo(72.0, 27.800001);
((GeneralPath)shape).lineTo(72.0, 98.9);
((GeneralPath)shape).lineTo(0.0, 98.9);
((GeneralPath)shape).lineTo(0.0, 1.1);
((GeneralPath)shape).lineTo(45.0, 1.1);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.1);
((GeneralPath)shape).lineTo(72.0, 27.800001);
((GeneralPath)shape).lineTo(72.0, 98.9);
((GeneralPath)shape).lineTo(0.0, 98.9);
((GeneralPath)shape).lineTo(0.0, 1.1);
((GeneralPath)shape).lineTo(45.0, 1.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.3, 23.7);
((GeneralPath)shape).curveTo(34.0, 25.300001, 31.3, 27.2, 29.9, 30.300001);
((GeneralPath)shape).curveTo(27.4, 35.600002, 34.9, 41.5, 35.2, 41.7);
((GeneralPath)shape).curveTo(35.3, 41.8, 35.4, 41.8, 35.5, 41.8);
((GeneralPath)shape).curveTo(35.6, 41.8, 35.7, 41.8, 35.8, 41.7);
((GeneralPath)shape).curveTo(35.899998, 41.600002, 36.0, 41.4, 35.899998, 41.2);
((GeneralPath)shape).curveTo(35.899998, 41.100002, 33.199997, 35.9, 33.3, 32.2);
((GeneralPath)shape).curveTo(33.3, 30.900002, 35.2, 29.400002, 37.1, 27.900002);
((GeneralPath)shape).curveTo(38.899998, 26.500002, 40.899998, 24.800001, 42.0, 22.900002);
((GeneralPath)shape).curveTo(44.6, 18.7, 41.7, 14.600001, 41.7, 14.600001);
((GeneralPath)shape).curveTo(41.600002, 14.400002, 41.4, 14.400002, 41.2, 14.500001);
((GeneralPath)shape).curveTo(41.0, 14.6, 40.9, 14.800001, 41.0, 15.000001);
((GeneralPath)shape).curveTo(41.0, 15.000001, 41.6, 17.7, 40.0, 20.5);
((GeneralPath)shape).curveTo(39.3, 21.5, 37.9, 22.5, 36.3, 23.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(29.386999130249023, 28.042999267578125), new Point2D.Double(43.01900100708008, 28.042999267578125), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(46.0, 25.5);
((GeneralPath)shape).curveTo(46.2, 25.4, 46.2, 25.2, 46.1, 25.0);
((GeneralPath)shape).curveTo(45.999996, 24.8, 45.8, 24.7, 45.6, 24.8);
((GeneralPath)shape).curveTo(45.199997, 25.0, 35.899998, 28.5, 35.899998, 32.8);
((GeneralPath)shape).curveTo(35.899998, 35.8, 37.199997, 37.399998, 38.1, 38.5);
((GeneralPath)shape).curveTo(38.5, 39.0, 38.8, 39.3, 38.899998, 39.7);
((GeneralPath)shape).curveTo(39.199997, 40.7, 38.499996, 42.4, 38.199997, 43.0);
((GeneralPath)shape).curveTo(38.1, 43.2, 38.199997, 43.4, 38.299995, 43.5);
((GeneralPath)shape).curveTo(38.399994, 43.6, 38.499996, 43.6, 38.599995, 43.6);
((GeneralPath)shape).curveTo(38.699993, 43.6, 38.799995, 43.6, 38.799995, 43.5);
((GeneralPath)shape).curveTo(38.999996, 43.4, 42.699997, 40.7, 41.999996, 37.6);
((GeneralPath)shape).curveTo(41.799995, 36.399998, 41.199997, 35.5, 40.599995, 34.699997);
((GeneralPath)shape).curveTo(39.799995, 33.499996, 39.199993, 32.6, 40.099995, 30.999996);
((GeneralPath)shape).curveTo(41.299995, 29.099997, 45.999996, 25.499996, 45.999996, 25.499996);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.979000091552734, 34.17599868774414), new Point2D.Double(46.207000732421875, 34.17599868774414), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.9, 43.6);
((GeneralPath)shape).curveTo(21.699999, 44.1, 21.8, 44.5, 22.1, 45.0);
((GeneralPath)shape).curveTo(23.1, 46.4, 26.7, 47.2, 32.1, 47.2);
((GeneralPath)shape).lineTo(34.399998, 47.2);
((GeneralPath)shape).curveTo(43.1, 46.9, 46.399998, 44.2, 46.5, 44.100002);
((GeneralPath)shape).curveTo(46.6, 44.000004, 46.7, 43.800003, 46.6, 43.600002);
((GeneralPath)shape).curveTo(46.499996, 43.4, 46.3, 43.300003, 46.1, 43.4);
((GeneralPath)shape).curveTo(43.0, 44.2, 37.3, 44.5, 33.3, 44.5);
((GeneralPath)shape).curveTo(28.8, 44.5, 26.599998, 44.2, 26.0, 43.9);
((GeneralPath)shape).curveTo(26.3, 43.5, 28.0, 42.800003, 30.2, 42.4);
((GeneralPath)shape).curveTo(30.400002, 42.4, 30.6, 42.2, 30.5, 42.0);
((GeneralPath)shape).curveTo(30.5, 41.8, 30.3, 41.6, 30.1, 41.6);
((GeneralPath)shape).curveTo(29.0, 41.5, 22.6, 41.6, 21.900002, 43.6);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(21.820999145507812, 44.35100173950195), new Point2D.Double(46.71500015258789, 44.35100173950195), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(51.1, 40.8);
((GeneralPath)shape).curveTo(49.3, 40.8, 47.6, 41.7, 47.5, 41.7);
((GeneralPath)shape).curveTo(47.3, 41.8, 47.2, 42.0, 47.3, 42.2);
((GeneralPath)shape).curveTo(47.3, 42.4, 47.5, 42.5, 47.7, 42.5);
((GeneralPath)shape).curveTo(47.7, 42.5, 51.5, 42.5, 51.9, 44.7);
((GeneralPath)shape).curveTo(52.2, 46.600002, 48.300003, 49.600002, 46.800003, 50.600002);
((GeneralPath)shape).curveTo(46.600002, 50.7, 46.600002, 50.9, 46.600002, 51.100002);
((GeneralPath)shape).curveTo(46.7, 51.300003, 46.800003, 51.4, 47.000004, 51.4);
((GeneralPath)shape).lineTo(47.100002, 51.4);
((GeneralPath)shape).curveTo(47.500004, 51.300003, 56.0, 49.4, 55.100002, 44.5);
((GeneralPath)shape).curveTo(54.500004, 41.5, 52.600002, 40.8, 51.100002, 40.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(46.60599899291992, 46.14899826049805), new Point2D.Double(55.1510009765625, 46.14899826049805), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.3, 50.1);
((GeneralPath)shape).curveTo(45.3, 49.899998, 45.3, 49.8, 45.1, 49.699997);
((GeneralPath)shape).lineTo(43.1, 48.299995);
((GeneralPath)shape).curveTo(43.0, 48.199997, 42.899998, 48.199997, 42.8, 48.199997);
((GeneralPath)shape).curveTo(42.8, 48.199997, 40.6, 48.799995, 37.5, 49.1);
((GeneralPath)shape).curveTo(36.3, 49.199997, 34.9, 49.3, 33.5, 49.3);
((GeneralPath)shape).curveTo(30.4, 49.3, 28.4, 48.899998, 28.1, 48.7);
((GeneralPath)shape).lineTo(28.1, 48.600002);
((GeneralPath)shape).curveTo(28.2, 48.500004, 28.4, 48.300003, 28.6, 48.2);
((GeneralPath)shape).curveTo(28.800001, 48.100002, 28.9, 47.9, 28.9, 47.7);
((GeneralPath)shape).curveTo(28.8, 47.5, 28.6, 47.4, 28.4, 47.4);
((GeneralPath)shape).curveTo(26.4, 47.9, 25.3, 48.600002, 25.4, 49.5);
((GeneralPath)shape).curveTo(25.5, 51.0, 29.1, 51.8, 32.1, 52.0);
((GeneralPath)shape).lineTo(33.5, 52.0);
((GeneralPath)shape).curveTo(38.5, 52.0, 45.0, 50.4, 45.0, 50.4);
((GeneralPath)shape).curveTo(45.1, 50.4, 45.2, 50.2, 45.3, 50.100002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(25.340999603271484, 49.67499923706055), new Point2D.Double(45.284000396728516, 49.67499923706055), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.9, 53.4);
((GeneralPath)shape).curveTo(30.1, 53.300003, 30.1, 53.100002, 30.1, 52.9);
((GeneralPath)shape).curveTo(30.0, 52.7, 29.9, 52.600002, 29.7, 52.600002);
((GeneralPath)shape).curveTo(29.400002, 52.600002, 27.0, 52.7, 26.800001, 54.300003);
((GeneralPath)shape).curveTo(26.7, 54.800003, 26.900002, 55.200005, 27.2, 55.500004);
((GeneralPath)shape).curveTo(28.1, 56.500004, 30.400002, 57.100002, 34.3, 57.400005);
((GeneralPath)shape).lineTo(35.7, 57.400005);
((GeneralPath)shape).curveTo(40.7, 57.400005, 44.1, 55.800007, 44.2, 55.800007);
((GeneralPath)shape).curveTo(44.3, 55.70001, 44.4, 55.600006, 44.4, 55.400005);
((GeneralPath)shape).curveTo(44.4, 55.200005, 44.300003, 55.100006, 44.2, 55.000004);
((GeneralPath)shape).lineTo(41.600002, 53.400005);
((GeneralPath)shape).curveTo(41.500004, 53.300007, 41.4, 53.300007, 41.300003, 53.300007);
((GeneralPath)shape).curveTo(41.300003, 53.300007, 39.600002, 53.600006, 37.200005, 54.000008);
((GeneralPath)shape).curveTo(36.700005, 54.100006, 36.100006, 54.100006, 35.500004, 54.100006);
((GeneralPath)shape).curveTo(33.000004, 54.100006, 30.300003, 53.700005, 29.800003, 53.400005);
((GeneralPath)shape).curveTo(29.800003, 53.500004, 29.800003, 53.400005, 29.900003, 53.400005);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(26.775999069213867, 55.03900146484375), new Point2D.Double(44.49599838256836, 55.03900146484375), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.4, 62.2);
((GeneralPath)shape).curveTo(44.9, 62.2, 51.0, 60.100002, 52.2, 58.9);
((GeneralPath)shape).curveTo(52.600002, 58.4, 52.7, 58.0, 52.600002, 57.7);
((GeneralPath)shape).curveTo(52.500004, 57.0, 51.9, 56.600002, 51.800003, 56.5);
((GeneralPath)shape).curveTo(51.600002, 56.4, 51.4, 56.4, 51.300003, 56.6);
((GeneralPath)shape).curveTo(51.200005, 56.8, 51.200005, 57.0, 51.300003, 57.1);
((GeneralPath)shape).curveTo(51.4, 57.199997, 51.4, 57.3, 51.200005, 57.6);
((GeneralPath)shape).curveTo(50.800003, 58.0, 46.000004, 59.399998, 38.000004, 59.8);
((GeneralPath)shape).curveTo(36.900005, 59.899998, 35.800003, 59.899998, 34.600002, 59.899998);
((GeneralPath)shape).curveTo(27.500002, 59.899998, 22.200003, 58.899998, 21.600002, 58.399998);
((GeneralPath)shape).curveTo(21.900002, 57.999996, 23.700003, 57.399998, 25.700003, 57.1);
((GeneralPath)shape).curveTo(25.900003, 57.1, 26.100002, 56.899998, 26.000002, 56.6);
((GeneralPath)shape).curveTo(26.000002, 56.399998, 25.800001, 56.199997, 25.500002, 56.3);
((GeneralPath)shape).lineTo(25.0, 56.3);
((GeneralPath)shape).curveTo(21.8, 56.5, 18.0, 56.899998, 17.8, 58.6);
((GeneralPath)shape).curveTo(17.699999, 59.1, 17.9, 59.6, 18.199999, 60.0);
((GeneralPath)shape).curveTo(19.199999, 60.9, 21.699999, 62.2, 33.399998, 62.2);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(17.847000122070312, 59.17499923706055), new Point2D.Double(52.66400146484375, 59.17499923706055), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.5, 59.2);
((GeneralPath)shape).curveTo(54.3, 59.100002, 54.1, 59.2, 54.0, 59.3);
((GeneralPath)shape).curveTo(54.0, 59.3, 52.3, 61.1, 47.1, 62.2);
((GeneralPath)shape).curveTo(45.1, 62.600002, 41.399998, 62.8, 36.0, 62.8);
((GeneralPath)shape).curveTo(30.6, 62.8, 25.5, 62.6, 25.5, 62.6);
((GeneralPath)shape).curveTo(25.3, 62.6, 25.1, 62.699997, 25.1, 63.0);
((GeneralPath)shape).curveTo(25.1, 63.2, 25.2, 63.4, 25.4, 63.5);
((GeneralPath)shape).curveTo(25.5, 63.5, 30.8, 64.8, 38.1, 64.8);
((GeneralPath)shape).curveTo(41.6, 64.8, 45.0, 64.5, 48.3, 64.0);
((GeneralPath)shape).curveTo(54.3, 62.9, 54.8, 60.0, 54.8, 59.8);
((GeneralPath)shape).curveTo(54.7, 59.5, 54.6, 59.3, 54.5, 59.2);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(25.01099967956543, 61.909000396728516), new Point2D.Double(54.71799850463867, 61.909000396728516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_7);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.7, 91.0);
((GeneralPath)shape).lineTo(7.3, 73.1);
((GeneralPath)shape).lineTo(11.0, 73.1);
((GeneralPath)shape).lineTo(13.7, 85.4);
((GeneralPath)shape).lineTo(17.0, 73.1);
((GeneralPath)shape).lineTo(21.4, 73.1);
((GeneralPath)shape).lineTo(24.6, 85.6);
((GeneralPath)shape).lineTo(27.4, 73.1);
((GeneralPath)shape).lineTo(31.1, 73.1);
((GeneralPath)shape).lineTo(26.7, 91.0);
((GeneralPath)shape).lineTo(22.800001, 91.0);
((GeneralPath)shape).lineTo(19.2, 77.6);
((GeneralPath)shape).lineTo(15.6, 91.0);
((GeneralPath)shape).lineTo(11.700001, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.9, 91.0);
((GeneralPath)shape).lineTo(43.9, 91.0);
((GeneralPath)shape).lineTo(42.300003, 86.9);
((GeneralPath)shape).lineTo(35.100002, 86.9);
((GeneralPath)shape).lineTo(33.6, 91.0);
((GeneralPath)shape).lineTo(29.699999, 91.0);
((GeneralPath)shape).lineTo(36.8, 73.1);
((GeneralPath)shape).lineTo(40.7, 73.1);
((GeneralPath)shape).lineTo(47.9, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(41.2, 83.9);
((GeneralPath)shape).lineTo(38.7, 77.3);
((GeneralPath)shape).lineTo(36.3, 83.9);
((GeneralPath)shape).lineTo(41.2, 83.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.9, 91.0);
((GeneralPath)shape).lineTo(49.9, 73.1);
((GeneralPath)shape).lineTo(57.600002, 73.1);
((GeneralPath)shape).curveTo(59.500004, 73.1, 60.9, 73.299995, 61.800003, 73.6);
((GeneralPath)shape).curveTo(62.700005, 73.9, 63.4, 74.5, 63.9, 75.299995);
((GeneralPath)shape).curveTo(64.4, 76.09999, 64.700005, 77.1, 64.700005, 78.1);
((GeneralPath)shape).curveTo(64.700005, 79.4, 64.3, 80.6, 63.500004, 81.4);
((GeneralPath)shape).curveTo(62.700005, 82.200005, 61.500004, 82.8, 59.900005, 83.1);
((GeneralPath)shape).curveTo(60.700005, 83.6, 61.300007, 84.1, 61.900005, 84.6);
((GeneralPath)shape).curveTo(62.400005, 85.1, 63.100006, 86.1, 64.00001, 87.5);
((GeneralPath)shape).lineTo(66.200005, 91.0);
((GeneralPath)shape).lineTo(61.800003, 91.0);
((GeneralPath)shape).lineTo(59.200005, 87.1);
((GeneralPath)shape).curveTo(58.300003, 85.7, 57.600006, 84.799995, 57.300003, 84.5);
((GeneralPath)shape).curveTo(57.0, 84.200005, 56.600002, 83.9, 56.200005, 83.8);
((GeneralPath)shape).curveTo(55.800003, 83.700005, 55.200005, 83.600006, 54.400005, 83.600006);
((GeneralPath)shape).lineTo(53.700005, 83.600006);
((GeneralPath)shape).lineTo(53.700005, 91.0);
((GeneralPath)shape).lineTo(49.900005, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.5, 80.7);
((GeneralPath)shape).lineTo(56.2, 80.7);
((GeneralPath)shape).curveTo(58.0, 80.7, 59.100002, 80.6, 59.5, 80.5);
((GeneralPath)shape).curveTo(59.9, 80.4, 60.3, 80.1, 60.5, 79.7);
((GeneralPath)shape).curveTo(60.7, 79.299995, 60.9, 78.899994, 60.9, 78.399994);
((GeneralPath)shape).curveTo(60.9, 77.799995, 60.7, 77.299995, 60.4, 76.899994);
((GeneralPath)shape).curveTo(60.100002, 76.49999, 59.600002, 76.299995, 59.0, 76.2);
((GeneralPath)shape).curveTo(58.7, 76.2, 57.8, 76.1, 56.3, 76.1);
((GeneralPath)shape).lineTo(53.399998, 76.1);
((GeneralPath)shape).lineTo(53.399998, 80.7);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.1);
((GeneralPath)shape).lineTo(72.0, 27.800001);
((GeneralPath)shape).lineTo(45.0, 27.800001);
((GeneralPath)shape).lineTo(45.0, 1.1);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.084999084472656, 74.13099670410156), new Point2D.Double(58.584999084472656, 87.63099670410156), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.1);
((GeneralPath)shape).lineTo(72.0, 27.800001);
((GeneralPath)shape).lineTo(45.0, 27.800001);
((GeneralPath)shape).lineTo(45.0, 1.1);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.1);
((GeneralPath)shape).lineTo(72.0, 27.800001);
((GeneralPath)shape).lineTo(45.0, 27.800001);
((GeneralPath)shape).lineTo(45.0, 1.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_5);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12999992072582245;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 9.999846806749701E-4;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7400000691413879;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_war() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static ResizableIcon of(int width, int height) {
       ext_war base = new ext_war();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_war base = new ext_war();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_war::new;
    }
}

