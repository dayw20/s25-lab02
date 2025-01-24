function newsquare(sideLen: number): Shape {
    if (sideLen <= 0) {
        throw new Error('Side length must be positive');
    }

    return {
        computeArea: () => sideLen * sideLen,
        getName: () => 'Square'
    };
}

export { newsquare }