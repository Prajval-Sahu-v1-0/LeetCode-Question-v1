class Solution:
    def checkOverlap(self, radius: int, xCenter: int, yCenter: int,
                      x1: int, y1: int, x2: int, y2: int) -> bool:
        # Closest point on the rectangle to the circle's center
        closest_x = max(x1, min(xCenter, x2))
        closest_y = max(y1, min(yCenter, y2))

        # Squared distance from center to that closest point
        dist_sq = (closest_x - xCenter) ** 2 + (closest_y - yCenter) ** 2

        return dist_sq <= radius ** 2