package uz.ulugbek.custombar.bottombar

import uz.ulugbek.custombar.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {

    object Home:BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.baseline_home_24,
        icon_focused = R.drawable.ic_home_focused,
    )

    object Report:BottomBarScreen(
        route = "report",
        title = "Report",
        icon = R.drawable.baseline_report_24,
        icon_focused = R.drawable.baseline_report_24,
    )

    object Profile:BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.baseline_account_circle_24,
        icon_focused = R.drawable.baseline_account_circle_24,
    )

    object Profile1:BottomBarScreen(
        route = "profile1",
        title = "Profile1",
        icon = R.drawable.baseline_account_circle_24,
        icon_focused = R.drawable.baseline_account_circle_24,
    )

    object Profile2:BottomBarScreen(
        route = "profile2",
        title = "Profile2",
        icon = R.drawable.baseline_account_circle_24,
        icon_focused = R.drawable.baseline_account_circle_24,
    )


}