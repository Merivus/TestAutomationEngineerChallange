FROM maven:3.9.0-eclipse-temurin-11-focal

# Install Java.
RUN apt-get update && apt-get install -q -y \
    curl \
    wget \
    zip \
    #openjdk-11-jdk \
    apt-transport-https \
    gnupg2 \
    ca-certificates

WORKDIR /app

COPY . /app

RUN curl -SsL https://downloads.gauge.org/stable | sh

# Install gauge plugins
RUN gauge install java && \
    gauge install screenshot &&\
    gauge config runner_connection_timeout 300000

RUN wget -q "https://chromedriver.storage.googleapis.com/2.35/chromedriver_linux64.zip" -O /tmp/chromedriver.zip &&\
    unzip /tmp/chromedriver.zip -d /usr/local/bin/ &&\
    rm /tmp/chromedriver.zip

ENV PATH=$HOME/.gauge:$PATH

RUN mvn clean install

CMD ["gauge","run","specs"]