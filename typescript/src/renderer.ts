function newRenderer(shape: Shape) {
    return {
        draw() {
            const area = shape.computeArea();
            console.log(`${shape.getName()} drawn\nIts area is ${area.toFixed(2)}`);
        }
    };
}

export { newRenderer }