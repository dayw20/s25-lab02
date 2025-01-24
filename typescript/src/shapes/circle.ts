function newCircle(radius: number): Shape {
    if (radius <= 0) {
        throw new Error('Radius must be positive');
    }

    return {
        computeArea: () => Math.PI * radius * radius,
        getName: () => 'Circle'
    };
}

export { newCircle }
