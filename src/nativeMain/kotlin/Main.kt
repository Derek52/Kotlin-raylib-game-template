import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.*
import raylib.*
import raylib.Color

@OptIn(ExperimentalForeignApi::class)
fun main(args: Array<String>) {

    val SCREEN_WIDTH = 1280
    val SCREEN_HEIGHT = 720
    InitWindow(SCREEN_WIDTH, SCREEN_HEIGHT, "Hola")
    SetTargetFPS(60)

    while (!WindowShouldClose()) {
        BeginDrawing()
        ClearBackground(COLOR_RED.readValue())
        DrawText("Happy Coding!", SCREEN_WIDTH/2-120, SCREEN_HEIGHT/2-42, 40, COLOR_DARKGRAY.readValue())
        DrawText("This is a Raylib window powered by\n\t\t\t\t\t\t\t\t Kotlin Native", SCREEN_WIDTH/4, SCREEN_HEIGHT/2, 36, COLOR_DARKGRAY.readValue())
        EndDrawing()
    }
    CloseWindow()

}
