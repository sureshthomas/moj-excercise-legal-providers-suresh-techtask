FROM debian:10.1

ARG deb=java-1.8.0-amazon-corretto-jdk_8.232.09-1_amd64.deb
ARG path=https://d3pxv6yz143wms.cloudfront.net/8.232.09.1
ARG md5=88ea4a5a1dbdf8b11437cf945552f14c


# In addition to installing the DEB, we also install
# fontconfig. The folks who manage the docker hub's
# official image library have found that font management
# is a common usecase, and painpoint, and have
# recommended that Java images include font support.
#
# See:
#  https://github.com/docker-library/official-images/blob/master/test/tests/java-uimanager-font/container.java

RUN mkdir -p /usr/share/man/man1 \
 && apt-get update \
 && apt-get install -y wget java-common libgcrypt20 libtasn1-6 e2fsprogs \
 && wget $path/$deb \
 && echo "$md5 $deb" > check.md5 \
 && md5sum -c check.md5 --strict \
 && dpkg --install $deb \
 && apt-get install fontconfig -y \
 # cleanup
 && apt-get remove --purge wget -y \
 && apt-get autoremove -y -f \
 && apt-get clean -y \
 && apt-get autoclean -y \
 && rm -rf /var/lib/apt/lists/* check.md5\
 && rm $deb

ENV JAVA_APP_DIR=/workspace/app
ENV JAVA_HOME=/usr/lib/jvm/java-1.8.0-amazon-corretto

RUN  mkdir -p ${JAVA_APP_DIR}

WORKDIR ${JAVA_APP_DIR}

USER 1001:1001

EXPOSE 8080

VOLUME /tmp
ADD build/libs/*.jar app.jar
ENTRYPOINT ["java","-XX:+UseContainerSupport", "-XX:MaxRAMPercentage=70.0", "-XshowSettings:vm", "-jar", "./app.jar"]