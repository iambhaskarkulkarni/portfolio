<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Sending Email with Freemarker HTML Template Example</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>

    <!-- use the font -->
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            font-size: 48px;
        }
    </style>
</head>
<body style="margin: 0; padding: 0;">

<table align="center" border="0" cellpadding="0" cellspacing="0" width="600" style="border-collapse: collapse;">
    <tr>
        <td align="center" bgcolor="#78ab46" style="padding: 40px 0 30px 0;">
            <h2>Thanks so much for reaching out!</h2>
        </td>
    </tr>
    <tr>
        <td bgcolor="#eaeaea" style="padding: 40px 30px 40px 30px;">
            <p>Dear ${name},</p>
            <p>This auto-reply is just to let you know…
                We received your email and will get back to you with a (human) response as soon as possible.
                During [business_hours] that’s usually within a couple of hours. Evenings and weekends may take us a little bit longer.
                If you have general questions about [product], check out our [knowledge_base] for walkthroughs and answers to FAQs.
                If you have any additional information that you think will help us to assist you, please feel free to reply to this email.</p>
            <p>We look forward to chatting soon!</p>
            <#--<p>CLick here to verify your email <b>${token}</b></p>-->
            <p>Cheers,</p>
        </td>
    </tr>
    <tr>
        <td bgcolor="#777777" style="padding: 30px 30px 30px 30px;">
            <p>${signature}</p>
            <p>${location}</p>
        </td>
    </tr>
</table>

</body>
</html>