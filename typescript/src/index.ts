import { newRenderer } from './renderer.js';
import { newRectangle } from './shapes/rectangle.js';
import { newCircle } from './shapes/circle.js';
import { newsquare } from './shapes/square.js';

function processShape(shape: Shape) {
    const renderer = newRenderer(shape);
    renderer.draw();
}

processShape(newRectangle(2, 3));
processShape(newCircle(2));