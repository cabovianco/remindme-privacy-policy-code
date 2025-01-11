package com.cabovianco.remindme.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cabovianco.remindme.theme.background
import com.cabovianco.remindme.theme.topBar

@Composable
fun Main(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { TopBar() },
        backgroundColor = background
    ) {
        Content()
    }
}

@Composable
private fun TopBar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier,
        title = {
            Text(
                text = "RemindMe",
                color = Color.White
            )
        },
        backgroundColor = topBar
    )
}

@Composable
private fun Title(modifier: Modifier = Modifier, title: String) {
    Text(
        text = title,
        modifier = modifier.padding(horizontal = 16.dp, vertical = 40.dp),
        color = Color.White,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 36.sp
    )
}

@Composable
private fun SubTitle(modifier: Modifier = Modifier, title: String) {
    Text(
        text = title,
        modifier = modifier.padding(top = 40.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
        color = Color.White,
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 28.sp
    )
}

@Composable
private fun Body(modifier: Modifier = Modifier, body: String) {
    Text(
        text = body,
        modifier = modifier.padding(horizontal = 16.dp),
        color = Color.White,
        fontSize = 14.sp
    )
}

@Composable
private fun Items(modifier: Modifier = Modifier, items: List<String>) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        items.forEach {
            Text(
                text = "- $it",
                modifier = Modifier.padding(vertical = 4.dp),
                color = Color.White,
                fontSize = 14.sp
            )
        }
    }
}

@Composable
private fun Text() {
    Title(title = "Privacy Policy")
    Body(body = "This Privacy Policy applies to the RemindMe app (hereby referred to as “Application”) for mobile devices that was created by Thomas Cabovianco (hereby referred to as “Service Provider”) as an Ad-Supported service. This service is provided for use “AS IS”.")


    SubTitle(title = "Information Collection and Use")
    Body(body = "The Application itself does not collect any information directly from users. However, the Application uses third-party services, such as AdMob, which may automatically collect certain information to enhance their functionalities and provide relevant advertisements. This information may include:")
    Items(
        items = listOf(
            "Your device’s Internet Protocol (IP) address.",
            "The type of device and operating system you use.",
            "Approximate geographical location based on your device’s IP address.",
            "Usage statistics such as the time spent using the Application."
        )
    )
    Body(body = "The Application does not collect precise location data from your device.")


    SubTitle(title = "Third-Party Access")
    Body(body = "The Application uses third-party services that may collect data as part of their operations. These services include, but are not limited to, AdMob. Below are the links to the privacy policies of these third-party service providers:")
    Items(
        items = listOf(
            "Google Play Services",
            "AdMob"
        )
    )
    Body(body = "The Service Provider does not have control over the data collection practices of these third-party services. It is recommended that you review their privacy policies for more information.\n\nThe Service Provider may disclose User Provided and Automatically Collected Information:")
    Items(
        items = listOf(
            "As required by law, such as to comply with a subpoena or similar legal process.",
            "When the Service Provider believes in good faith that disclosure is necessary to protect their rights, protect your safety or the safety of others, investigate fraud, or respond to a government request.",
            "With trusted service providers who work on the Service Provider’s behalf and adhere to this Privacy Policy."
        )
    )


    SubTitle(title = "Opt-Out Rights")
    Body(body = "You can stop all collection of information by the Application’s third-party services by uninstalling the Application. You may use the standard uninstall processes available on your mobile device or the mobile application marketplace.")


    SubTitle(title = "Data Retention Policy")
    Body(body = "The Application itself does not retain any user data. Third-party services may retain data according to their own policies. For questions or requests regarding data removal, please contact the Service Provider at thomasjcabovianco@gmail.com, and the Service Provider will assist you as needed.")


    SubTitle(title = "Children")
    Body(body = "The Application and its third-party services do not knowingly collect personally identifiable information from children under the age of 13. If the Service Provider becomes aware that a child under 13 has provided personal information, this will be deleted promptly. If you are a parent or guardian and believe that your child has provided personal information, please contact the Service Provider at thomasjcabovianco@gmail.com.")


    SubTitle(title = "Security")
    Body(body = "The Service Provider is concerned about safeguarding the confidentiality of your information. The Application uses third-party services that implement security measures to protect user data. However, no method of transmission over the Internet or electronic storage is 100% secure, and the Service Provider cannot guarantee absolute security.")


    SubTitle(title = "Changes")
    Body(body = "This Privacy Policy may be updated from time to time. Any changes will be posted on this page, and significant updates may be communicated within the Application. Users are encouraged to review this Privacy Policy periodically.\n\nThis Privacy Policy is effective as of 2025-01-08.")


    SubTitle(title = "Your Consent")
    Body(body = "By using the Application, you consent to the processing of your information as described in this Privacy Policy and by third-party services integrated into the Application.")


    SubTitle(title = "Contact Us")
    Body(body = "If you have any questions regarding this Privacy Policy or privacy practices, please contact the Service Provider at thomasjcabovianco@gmail.com.")
}

@Composable
private fun MadeBy(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 256.dp, start = 32.dp, end = 32.dp, bottom = 32.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Made by @cabovianco",
            color = Color.White,
            fontSize = 14.sp
        )
    }
}

@Composable
private fun Content(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn(
            modifier = modifier.fillMaxWidth(0.75f)
        ) {
            item {
                Text()
                MadeBy()
            }
        }
    }
}
