[JAVA_BADGE]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[AWS_BADGE]: https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white
[MAVEN__BADGE]: https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white

<h1 align="center" style="font-weight: bold;">Uber Email Service Challenge 🚗 💻</h1>

![java][JAVA_BADGE]
![spring][SPRING_BADGE]
![maven][MAVEN__BADGE]
![AWS][AWS_BADGE]

<p align="center">
 <a href="#started">Getting Started</a> • 
  <a href="#routes">API Endpoints</a> •
 <a href="#colab">Collaborators</a> 
</p>

<p align="center">
  <b>
    This project is a challenge from Uber, where the main goal is to create an email service that sends emails to users.
  </b>
</p>

<h2 id="started">🚀 Getting started</h2>

This is a step-by-step guide to help you to run this project in your machine.

<h3>Prerequisites</h3>

Before you start, you will need to have the following tools installed on your machine:

- [Java 17](https://jdk.java.net/17/)
- [Maven](https://maven.apache.org/download.cgi)

And also, you will need to have an AWS account to use the SES service.

Here is a list of the services you will need to have access to:

- [Amazon SES](https://aws.amazon.com/ses/)
- [Amazon IAM](https://aws.amazon.com/iam/)

<h3>Cloning</h3>

To clone this project, you will need to run the following command in your terminal:

```bash
git clone https://github.com/bantheus/Coding-Challenge-Uber-Email-Service.git
```

<h3> Environment Variables</h2>

To start the project, you will need to run the following commands:

```bash
cd Coding-Challenge-Uber-Email-Service
```

and then create a file called `application.properties` in the `src/main/resources` folder.

Here is an example of the file:

```yaml
aws.region=us-east-1
aws.accessKeyId={YOUR_AWS_KEY_ID}
aws.secretKey={YOUR_AWS_SECRET}
```

<h3>Running</h3>

To run the project, you will need to run the following command:

```bash
mvn spring-boot:run
```

<h2 id="routes">📍 API Endpoints</h2>

This is a list of all the routes available in the API.
​
| route | description  
|----------------------|-----------------------------------------------------
| <kbd>POST /api/email</kbd> | Send an email to a user [request details](#post-email)

<h3 id="post-email">POST /api/email</h3>

**REQUEST**

```json
{
  "to": "youremail@email.com",
  "subject": "Teste de email",
  "body": "Isso é um teste 🤘"
}
```

**RESPONSE**

```json
{
  Email sent successfully!
}
```

<h2 id="colab">🤝 Collaborators</h2>

Here are the people who contributed to this project:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/bantheus">
        <img src="https://avatars.githubusercontent.com/u/70174902?v=4" width="100px;" alt="Matheus Schmidt"/><br>
        <sub>
          <b>Matheus Schmidt</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

<h2 id="license">📝 License</h2>

This project is under the MIT license.

[⬆ Back to top](#table-of-contents)
