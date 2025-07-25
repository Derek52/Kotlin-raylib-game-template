import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.*
import raylib.*

@OptIn(ExperimentalForeignApi::class)
fun main(args: Array<String>) {

    val SCREEN_WIDTH = 1280
    val SCREEN_HEIGHT = 720
    InitWindow(SCREEN_WIDTH, SCREEN_HEIGHT, "Hola")
    SetTargetFPS(60)


    //val color = GetColor(990000)
    while (!WindowShouldClose()) {
        BeginDrawing()
        ClearBackground(COLOR_RED.readValue())
        EndDrawing()
    }
    CloseWindow()
    //SetTargetFPS(60)
    //InitWindow(SCREEN_WIDTH, SCREEN_HEIGHT)
    /*InitWindow(800, 600, "Raylib Kotlin/Native Demo")
    SetTargetFPS(60)

    while (!WindowShouldClose()) {
        BeginDrawing()
        ClearBackground(RAYWHITE)
        DrawText("Hola", 350, 280, 40, DARKGRAY)
        EndDrawing()
    }

    CloseWindow()*/
}
