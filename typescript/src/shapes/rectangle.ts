function newRectangle(width: number, height: number): Shape {
    if (width <= 0 || height <= 0) {
        throw new Error('Width and height must be positive');
    }

    return {
        computeArea: () => width * height,
        getName: () => 'Rectangle'
    };
}

export { newRectangle }
